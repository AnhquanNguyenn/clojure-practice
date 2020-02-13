(ns clojure-learning.core
  (:gen-class))

(def str1 "Hello World!")

(defn addTwoInputs [num1 num2]
  (+ num1 num2)
)

(defn addTwoInputsHelper []
  (println "Enter Input 1:") 
  (def a (read-line))
  (println "Enter Input 2:") 
  (def b (read-line))
  (println a "+" b "=" (addTwoInputs (Integer/parseInt a) (Integer/parseInt b)))  
)

(defn reverseString [x]
  (println "Using just the reverse command:" (reverse x))
  (println "Using the apply to look nicer:" (apply str (reverse x)))
)

(defn loopNumberOfTimes [x]
  (dotimes [_ x]
    (println str1))    
)

(defn -main
  [& args]
  (println str1)
  (reverseString str1)
)

