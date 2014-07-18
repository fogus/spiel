(ns fibndeck.core
  (:require [card-shuffle :as shuffle]))

(comment

  (def fibn [{:rank 0,  :suit :circle,   :color :blue}
             {:rank 13, :suit :circle,   :color :blue}
             {:rank 5,  :suit :line,     :color :yellow}
             {:rank 8,  :suit :line,     :color :yellow}
             {:rank 13, :suit :line,     :color :yellow}
             {:rank 5,  :suit :heart,    :color :purple}
             {:rank 8,  :suit :heart,    :color :purple}
             {:rank 13, :suit :heart,    :color :purple}
             {:rank 13, :suit :heart,    :color :purple}
             {:rank 13, :suit :heart,    :color :purple}
             {:rank 3,  :suit :triangle, :color :red, :pips 1}
             {:rank 5,  :suit :triangle, :color :red, :pips 2}
             {:rank 8,  :suit :triangle, :color :red, :pips 3}
             {:rank 8,  :suit :triangle, :color :red, :pips 1}
             {:rank 13, :suit :triangle, :color :red, :pips 2}
             {:rank 13, :suit :triangle, :color :red, :pips 3}
             {:rank 1,  :suit :square,   :color :green}
             {:rank 2,  :suit :square,   :color :green}
             {:rank 3,  :suit :square,   :color :green}
             {:rank 5,  :suit :square,   :color :green}
             {:rank 8,  :suit :square,   :color :green}
             {:rank 8,  :suit :square,   :color :green}
             {:rank 13, :suit :square,   :color :green}
             {:rank 13, :suit :square,   :color :green}
             {:rank 13, :suit :square,   :color :green}
             {:rank 1,  :suit :shogi,    :color :orange}
             {:rank 2,  :suit :shogi,    :color :orange}
             {:rank 3,  :suit :shogi,    :color :orange}
             {:rank 5,  :suit :shogi,    :color :orange}
             {:rank 8,  :suit :shogi,    :color :orange}
             {:rank 8,  :suit :shogi,    :color :orange}
             {:rank 13, :suit :shogi,    :color :orange}
             {:rank 13, :suit :shogi,    :color :orange}
             {:rank 13, :suit :shogi,    :color :orange}
             ])
  
  (-> fibn
      shuffle/riffle
      shuffle/overhand
      shuffle/riffle)




)
