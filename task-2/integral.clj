(defn func [x] (* x x))
(defn integral [f l r d] 
    (
        loop [i l res 0]
        (
            if (> (+ i d) r)
            res
            (recur (+ i d) (+ res  
                (* d (
                    / (
                        + (
                             f i
                        ) (f (+ i d))
                    ) 2
                ))    
            ))
        )
    )
)
(println (integral func 0 1 0.0001))
