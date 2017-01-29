(ns cci-clojure.chapter1.q9-is-rotation)

(defn isRotation
  [s1 s2]
  (.contains (str s1 s1) s2))
