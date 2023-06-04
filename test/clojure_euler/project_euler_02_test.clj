(ns clojure-euler.project-euler-02-test
  (:require [clojure.test :refer :all])
  (:require [clojure-euler.project-euler-02 :refer :all]))

(def four-million 4000000)

(deftest next-fibonacci-number-test
  (testing
    "should return next fibonacci value"
    (is (= (next-fibonacci-pair [2 3]) [3 5]))))

(deftest sum-if-is-needed-test
  (testing
    "sum if the next value is pair"
    (is (= (sum-if-is-needed 0 8) 8)))
  (testing
    "do nothing if value is odd"
    (is (= (sum-if-is-needed 0 5) 0))))

(deftest sum-of-fibonacci-terms-test
  (testing
    "should return the sum of the numbers below four milion"
    (is (= (sum-of-fibonacci-terms four-million) 4613732))))

