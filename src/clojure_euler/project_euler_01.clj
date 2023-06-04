(ns clojure-euler.project-euler-01
  "If we list all the natural numbers below 10
  that are multiples of 3 or 5, we get 3,5,6 and 9.
  The sum of these multiples is 23.
  Find the sum of all the multiples of 3 or 5 below 1000.")

(defn check-if-is-multiple
  "check if a number is multiple of three or five"
  [acc, number]
  (cond
    (= (rem number 5) 0) (+ acc number)
    (= (rem number 3) 0) (+ acc number)
    :else acc))

(defn sum-multiple-numbers
  "sum the multiple numbers between 0 and max-value"
  [max-value]
  (let [range (range 0 max-value)]
    (reduce check-if-is-multiple range)))

;I've tried an approach using `loop` to compare with using reduce/lists
(defn sum-multiple-numbers-for
  "sum the multiple numbers between 0 and max-value using for loop"
  [max-value]
  (loop [x 0 acc 0]
    (cond
      (< x max-value) (recur (inc x) (check-if-is-multiple acc x))
      :else acc)))
