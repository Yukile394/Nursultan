package minecraft;

public interface class03894 extends class03877 {
   @Override
   default class03979<? extends class03877> L() {
      return this.i().field_37089;
   }

   class03909 i();

   class03877 u();

   @Override
   default class03877 N(class03881 var1) {
      return var1.apply(new class03897(this.i(), this.u().N(var1)));
   }
}
