(ns clojure-euler.project-euler-02
  "Each new term in the Fibonacci sequence is generated
   by adding the previous two terms.
   By starting with 1 and 2, the first 10 terms will be
   1,2,3,5,8,13,21,34,55,89
   By considering the terms in the Fibonacci sequence
   whose values do not exceed four million,
   find the sum of the even-valued terms.")

(def fibonacci-start [1 2])

(defn next-fibonacci-pair
  "return the next fibonacci number"
  [[first second]]
  (let [next (+ second first)]
    [second next]))

(defn sum-if-is-needed
  [acc number]
  (if (= (rem number 2) 0)
    (+ acc number)
    acc))

(defn sum-of-fibonacci-terms
  "this function will sum the fibonacci values
  between 1 and max-value"
  [max-value]
  (loop [[value next] fibonacci-start acc 0]
    (if (< next max-value)
      (recur (next-fibonacci-pair [value next]) (sum-if-is-needed acc next))
      acc)))

