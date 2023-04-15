package main

import (
    "testing"
)

func TestSayHello(t *testing.T) {
    expected := "Hello World!"
    result := say_hello()

    if result != expected {
	t.Errorf("Expected '%s', but got '%s'", expected, result)
    }
}
