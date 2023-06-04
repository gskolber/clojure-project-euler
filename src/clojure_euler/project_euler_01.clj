(ns clojure-euler.project-euler-01)

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
    (reduce check-if-is-multiple range)
    )
  )

(defn sum-multiple-numbers-for
  "sum the multiple numbers between 0 and max-value using for loop"
  [max-value]
  (loop [x 0 acc 0]
    (cond
      (< x max-value) (recur (inc x) (check-if-is-multiple acc x))
      :else acc
    )))
