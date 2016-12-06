(ns fizzbuzz-clojure.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn fizz [number]
    (if (zero? (mod number 3))
      (str "Fizz!")))

(defn buzz [number]
    (if (zero? (mod number 5))
      (str "Buzz!")))

(defn fizzbuzz [number]
  (and (= (fizz number))(= (buzz number))(str "FizzBuzz!")))
