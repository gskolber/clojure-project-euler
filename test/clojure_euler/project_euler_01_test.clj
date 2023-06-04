(ns clojure-euler.project-euler-01-test
  (:require [clojure.test :refer :all])
  (:require [clojure-euler.project-euler-01 :refer :all]))

(deftest check-if-is-multiple-test
  (testing
    "should return the sum if value is multiple of 3"
    (is (= (check-if-is-multiple 0 3) 3)))
  (testing
    "should return the sum if value is multiple of 5"
    (is (= (check-if-is-multiple 0 10) 10)))
  (testing
    "shout not sum if not is divisible by 3 or 5"
    (is (= (check-if-is-multiple 0 7) 0)))
  )

(def expected-sum 233168)

(deftest sum-multiple-numbers-test
  (testing
    "should return 233.168"
    (is (= (sum-multiple-numbers 1000) expected-sum)))
  )

(deftest sum-multiple-numbers-for-test
  (testing
    "should return 233.168"
    (is (= (sum-multiple-numbers-for 1000) expected-sum)))
  )