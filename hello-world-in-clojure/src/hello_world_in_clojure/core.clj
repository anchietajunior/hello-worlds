(ns hello-world-in-clojure.core
  (:gen-class))

(defn say_hello []
  "Hello World!")

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (say_hello)))
