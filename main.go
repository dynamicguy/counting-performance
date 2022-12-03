package main
import "fmt"

func main() {
  for i := 1; i <= 10000000; i++ {
    fmt.Printf("%v,", i)
  }
}