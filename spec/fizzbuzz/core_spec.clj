(ns fizzbuzz-clojure.core-spec
  (:require [speclj.core :refer :all]
            [fizzbuzz-clojure.core :refer :all]))

(describe "fizz"
  (it "should return fizz when passed a multiple of 3"
    (let [result(fizz 5)]
    (should= "Fizz!" result))))
