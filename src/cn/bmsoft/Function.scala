package cn.bmsoft

object Function {

  def main(args: Array[String]): Unit = {

    // 默认参数和带名参数

    def decorate(str:String ,left:String = "[", right :String = "]")=left + str+right
// left  和right 都有默认参数
//print(decorate("222"))
   //有默认参数但是使用自定义的参数
//print(decorate("sss","<<<",">>>"))
   //如果给的参数不够的话，默认参数会从后往前逐个应用进来
 print(decorate("aaa","<<<"))


  //定义函数
//def abs(x: Double)= if(x >=6) x else -x

//print(abs(3))
  }
}
