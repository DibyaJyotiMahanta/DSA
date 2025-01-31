package main

import "fmt"

func main() {
	var num int = 121
	var orginalNum int = num
	var reverse int = 0

	for i := 0; i < 3; i++ {
		var temp int = num % 10
		reverse = reverse*10 + temp
		num = num / 10
	}
	fmt.Println(reverse == orginalNum)

}
