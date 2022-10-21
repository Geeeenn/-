<template>
  <div id="app">
    <!--  上部分头部-->
    <div style="height: 60px;line-height: 60px;background-color:white;margin-bottom: 2px">
      <img src="@/assets/logo.png" alt="" style="width: 40px;position:relative;top:10px;left: 20px">
      <span style="margin-left: 25px;font-size: 24px;">图书管理系统</span>
    </div>
    <!--下部分：侧边栏和主题部分-->
    <!--    style="display: flex"除了两百之外的宽度都给他-->
    <div style="display: flex">
      <!--      左边栏-->
      <!--      min-height: calc(100vh - 60px)给侧边栏一个最小高度，用calc计算，100vh意思是铺满整个div的高度-头部高度-->
      <div style="width: 200px;min-height: calc(100vh - 62px);overflow: hidden;margin-right: 2px;background-color:white">
        <el-menu :default-active="$route.path" :default-openeds="['/']" router class="el-menu-demo">
          <el-menu-item index='/'>
            <i class="el-icon-s-home"></i>
            <span>首页</span>
          </el-menu-item>
          <el-submenu index="/">
            <template slot="title">
              <i class="el-icon-s-platform"></i>
              <span>关于界面</span>
            </template>
            <el-menu-item index='/about'>关于详情</el-menu-item>
          </el-submenu>
        </el-menu>
      </div>
      <!--      主体-->
      <div style="flex: 1;background-color: white" >


        <router-view/>
      </div>
    </div>


  </div>
</template>



