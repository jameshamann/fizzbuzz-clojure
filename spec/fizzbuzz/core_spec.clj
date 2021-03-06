(ns fizzbuzz-clojure.core-spec
  (:require [speclj.core :refer :all]
            [fizzbuzz-clojure.core :refer :all]))

(describe "fizz"
  (it "should return fizz when passed a multiple of 3"
    (let [result(fizz 3)]
    (should= "Fizz!" result))))

(describe "buzz"
(it "should return buzz when passed a multiple of 5"
  (let [result(buzz 10)]
  (should= "Buzz!" result))))

(describe "fizzbuzz"
(it "should return fizzbuzz when passed a multiple of 3 and 5"
  (let [result(fizzbuzz 15)]
  (should= "FizzBuzz!" result)))

(it "should return fizzbuzz when passed a multiple of 3 and 5"
  (let [result(fizzbuzz 30)]
  (should= "FizzBuzz!" result)))

  (it "should return fizzbuzz when passed a multiple of 3 and 5"
    (let [result(fizzbuzz 90)]
    (should= "FizzBuzz!" result))))
