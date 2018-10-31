(defn nested-sum [arr] 
    (
        reduce + (flatten arr)
    )
)
(println (nested-sum '(1 (2 ((3))) (4 5))))
