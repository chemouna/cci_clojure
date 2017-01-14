(ns cci-clojure.chapter1.q2_reverse_cstyle_str
  (:require [clojure.string :as s]))

(defn reverse-cstyle-str
  [s]
  (s/reverse (butlast str)))
