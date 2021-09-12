;; First chapter of SICP
;; Exercices implementation

;; 1.2
(/ (+ 5 4 (- 2 (- 3 (+ 6 (/ 4 5)))))
   (* 3 (- 6 2) (- 2 7))) ; -37/150

;; 1.3
(defn sum-square-larger [x y z]
  (letfn [(square [n] (* n n))]
    (- (apply + (map square (vector x y z)))
       (square (min x y z)))))
