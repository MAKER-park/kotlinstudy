fun main(test : Array<String>){
    var doubletest : Double = 10.1111
    var floattest : Float = 10.1f
    var longVluetest : Long = 10
    var intValuetest : Int = 10
    var shortValuetest : Short = 10
    var bytevalueTest : Byte = 10
    println("dobuble = " + doubletest)//+ 로 이어서 쓸 수 있다.
    println("floattest = "+ floattest)
    println("longvalue = "+ longVluetest)
    println("intvalue = "+ intValuetest)
    println("shortvalue = "+ shortValuetest)
    println("bytevalue = " + bytevalueTest)
    //doubletest = intValuetest 형이 서로 다르기 떄문에 해당 값이 들어 갈 수 없다.
    doubletest = intValuetest.toDouble()//변수명.to변수형 으로 변환을 이용하면 가능하다.
    intValuetest = floattest.toInt()
    println("double = "+ doubletest)
    println("intvalue = " + intValuetest)

}