<template>
  <div>
    <!--  搜索表单-->
    <div style="margin-bottom: 20px">
      <el-input style="width: 240px" placeholder="请输入名称"></el-input>
      <el-input style="width: 240px;margin-left:5px" placeholder="请输入联系方式"></el-input>
      <el-button style="margin-left: 5px" type="primary"><i class="el-icon-search"></i>搜索</el-button>
    </div>
    <el-table :data="tableDate" stripe>
      <el-table-column prop="name" label="名称"></el-table-column>
      <el-table-column prop="age" label="年龄"></el-table-column>
      <el-table-column prop="address" label="地址"></el-table-column>
      <el-table-column prop="phone" label="电话"></el-table-column>
      <el-table-column prop="sex" label="性别"></el-table-column>
    </el-table>
    <!--  分页-->
    <div style="margin-top: 20px">
      <el-pagination
          background

          layout="prev, pager, next"
          :total="100">
      </el-pagination>
    </div>

  </div>
</template>


<script>
export default {
  name: 'HomeView',
  data(){
    return{
      tableDate:[]
    }


  },
  //连接后端让数据从前端显示
  created() {
    this.load()

  },
  methods:{
    load(){
      fetch('http://localhost:9090/user/list').then(res =>res.json()).then(res =>{
        console.log(res) //打印res（res就是数组）
        this.tableDate=res
      })
    }
  }

}
</script>

