(defn flatten2
    [x]
    (letfn [(flat [coll]             
                     (when-let [c (seq coll)] 
                       (let [x (first c)] 
                         (if (sequential? x) 
                           (concat (flat x) (flat (rest c))) 
                           (cons x (flat (rest c)))))))]
      (if (sequential? x) (flat x) x))
)
(println (flatten2 '(1 (2 ((3))) (4 5))))
