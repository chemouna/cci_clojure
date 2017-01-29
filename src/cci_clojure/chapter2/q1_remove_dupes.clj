(ns cci-clojure.chapter2.q1-remove-dupes
  (:require [clojure.test :refer :all]))

;; O(n^2)
(defn de-dupe
  [s]
  (reduce (fn [res c] (if (some #{c} res) res (str res c))) "" s))

(defn remove-dupes
  [l]
  (reduce (fn [deduped node]
            (conj (remove #(= node %) deduped) node))
  '()
  (reverse l)))

(deftest a-test
  (testing
    (is (= (de-dupe "aa") "a"))
    (is (= (de-dupe "aba") "ab"))
    (is (= (de-dupe "FOLLOWUP") "FOLWUP"))))

(run-tests)

(remove-dupes "FOLLOWUP")
