package cn.bmsoft

object Class {
    //简单类和无参方法：
  private var value=0
  def increment (){value +=1}
  def current()=value

//一个类如果没有显示定义主构造器，则自动拥有一个无参的构造器即可，
  //val p1= new Person();  主构造器
  //val p2=new Person("Fred") 第一个辅助构造器
  //val p3=new Person("Fred",22)  第二个辅助构造器


}
