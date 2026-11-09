package minecraft;

import java.util.Optional;

public interface class03278 extends class06521<class02934> {
   class06510 M();

   Optional<class06510> B();

   @Override
   default class00305 i() {
      return class06222.E;
   }

   @Override
   default class05838<class03278> u() {
      return class05838.M;
   }

   default boolean method_8115(class02934 var1, class07299 var2) {
      return class06510.method_61676(this.R(), var1.L()) && this.M().method_8093(var1.u()) && class06510.method_61676(this.B(), var1.i());
   }

   @Override
   class06514<? extends class03278> method_8119();

   Optional<class06510> R();
}
