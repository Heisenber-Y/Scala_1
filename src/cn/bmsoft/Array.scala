package cn.bmsoft

import scala.collection.mutable.ArrayBuffer

object Array {

  def main(args: Array[String]): Unit = {

  //变长数组，数组缓冲
    val strings = ArrayBuffer[String]()
    strings  +=("1","2","3")
    strings.insert(2,"a","b","c")
    //for (elem<- strings) print(elem)
    //第一个参数表示插入或者删除的位置。第二个参数表示需要移除多少个元素
    strings.remove(2,3)
    for(elem <- strings) print(elem)


    //val b = ArrayBuffer[Int]()
 // b += (1,2,3,4,5)

    //b.insert(2,9)
    //for (elem <- b) print(elem+"-")



    //b +=1
    //for(elem <- b) print(elem+"--")
  //b += (1,2,3,4,5)
   //for(elem <- b) print(elem+"---")
   //b += (8,13,21)
  // print("--------------")
   // for(elem <- b ) println(elem+"----")
  //移除最后5个元素
    //b.trimEnd(5)
//for (elem <- b) println(b+"---")


  //在尾端添加多个元素，亿括号抱起来
  // val ints = ArrayBuffer(1,2,3,4,5)
  //for (elem <- ints) print(elem+"-")


//一个空的数组，准备存放数据
 // val b = ArrayBuffer[Int]()
  //b +=1





  //长度为2的Array[STRING] --类型是推断出来的
    //说明：以提供初始值就不需要new
    //val value = Array("Hello","world")



    //10个元素的字符串数组，所有元素初始化为null
 //  val strings = new Array[String](10)
  //for (elem <- strings) print(elem+"--")



  //val nums = new Array[Int](10)
  //10个整数的数组，所有元素的初始化为0
  //for (elem <- nums) print(elem+"---")


  }


}
