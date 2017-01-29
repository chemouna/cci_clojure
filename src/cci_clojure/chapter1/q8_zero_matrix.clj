(ns cci-clojure.chapter1.q8_zero_matrix
  (:require [clojure.test :refer :all]))

(defn indices
  [m]
  "Reduces the indices (pairs) of matrix m"
  (let [dim (range (count m))]
    (for [x dim y dim] [x y])))

(defn reset-cell?
  [m x y]
  (zero? (get-in m [x y])))

(defn track
  [r x y]
  (-> r
      (update-in [:rows] #(conj % x))
      (update-in [:cols] #(conj % y))))

(defn resets
  [m]
  (reduce (fn [r [x y]] (if (reset-cell? m x y) (track r x y) r))
          {:rows #{} :cols #{}} ;; this is an interesting way of using reduce
          (indices m)))

;; notice the small function usage where each does and have one small precise thing to do.
(defn reset-row
  [m row]
  (assoc m row (vec (repeat (count m) 0))))

(defn reset-col
  [m col]
  (reduce #(assoc-in %1 [%2 col] 0) m (range (count m))))

(defn reset
  [m]
  (let [{:keys [rows cols]} (resets m)]
   (reduce reset-row (reduce reset-col m cols) rows)))

;; (reset [[1 0] [1 1]])
;; (reset [[1 1 1][1 0 1][1 1 1]])

(deftest q8_test
  (testing
    (is (= (reset [[1 0][1 1]]) [[0 0][1 0]]))
    (is (= (reset [[1 1 1][1 0 1][1 1 1]]) [[1 0 1][0 0 0][1 0 1]]))))

;; (run-tests)
