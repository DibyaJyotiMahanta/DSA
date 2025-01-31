package main

import "fmt"

func main() {
	var str string = "piggip"
	var str2 string = ""
	for i := len(str) - 1; i >= 0; i-- {
		str2 += string(str[i])
	}
	fmt.Println(str2 == str)
}
