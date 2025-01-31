package main

import (
	"fmt"
	"strconv"
)

func main() {
	var num int = 121
	var number string = strconv.Itoa(num)
	var rev string = ""
	for i := len(number) - 1; i >= 0; i-- {
		rev += string(number[i])
	}
	actual, _ := strconv.Atoi(rev)
	fmt.Println(actual)
}
