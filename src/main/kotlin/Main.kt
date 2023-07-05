fun main() {
//    var myStack = Stack()
//    println(myStack.pop())
//    myStack.push(5)
//    myStack.push(24)
//    myStack.push(62)
//    println(myStack.peek())
//    println(myStack.pop())
//    println(myStack.peek())
//    myStack.push(14)
//    myStack.push(51)
//    myStack.push(88)
//    var x = myStack.pop()
//    var y = myStack.pop()
//    var z = x!!+y!!
//    println(z) *****(use Int instead of char in class to print this)
    var str = "Hello"
    var result = mutableListOf<Char>()
    var stack = Stack()
    str.forEach{c ->stack.push(c)}
    while (!stack.isEmpty()){
        result.add(stack.pop()!!)
    }
    println(result.joinToString (""))

}
class Stack{
    var data = mutableListOf<Char>()

    fun push (value: Char){
        data.add(value)
    }
    fun pop():Char?{
        if (data.isEmpty()){
            return null
        }
        var top = data[data.lastIndex]
        data.removeAt(data.lastIndex)
        return top
    }
    fun peek():Char?{
        if (data.isEmpty()){
            return null
        }
        return data[data.lastIndex]
    }
    fun isEmpty(): Boolean{
        return data.isEmpty()
    }
}