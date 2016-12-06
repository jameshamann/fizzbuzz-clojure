(ns fizzbuzz-clojure.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

  (defn fizz
    "Checking whether a number is divisible by three"
    [number]
    (if (zero? (mod number 3))
      (println "Fizz!")))

  (defn buzz
    "Checking whether a number is divisible by five"
     [number]
     (if (zero? (mod number 5))
       (println "Buzz!")))

  ; (defn fizzbuzz
  ;   "Checking whether a number is divisible by three and five"
  ;   [number]
  ;   (if (zero?))
  ;     (println "FizzBuzz!"))
