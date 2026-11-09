package minecraft;

import java.util.Optional;

public sealed interface class07737 extends class08884 permits class07037, class07730, class07720, class07729, class07009, class07019 {
   long M();

   @Override
   default Optional<Number> P() {
      return Optional.of(this.W());
   }

   @Override
   default Optional<Short> T() {
      return Optional.of(this.Z());
   }

   int B();

   short Z();

   @Override
   default Optional<Integer> b() {
      return Optional.of(this.B());
   }

   @Override
   default Optional<Byte> s() {
      return Optional.of(this.z());
   }

   @Override
   default Optional<Double> n() {
      return Optional.of(this.U());
   }

   @Override
   default Optional<Boolean> t() {
      return Optional.of(this.z() != 0);
   }

   @Override
   default Optional<Float> v() {
      return Optional.of(this.E());
   }

   @Override
   default Optional<Long> j() {
      return Optional.of(this.M());
   }

   double U();

   byte z();

   float E();

   Number W();
}
