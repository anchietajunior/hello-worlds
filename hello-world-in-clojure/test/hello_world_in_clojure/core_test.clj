(ns hello-world-in-clojure.core-test
  (:require [clojure.test :refer :all]
            [hello-world-in-clojure.core :refer :all]))

(deftest test-say-hello
  (testing "say_hello function"
    (is (= "Hello World!" (say_hello)))))
