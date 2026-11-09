package minecraft;

public record class03702(
   class03265 thirdPersonLeftHand,
   class03265 thirdPersonRightHand,
   class03265 firstPersonLeftHand,
   class03265 firstPersonRightHand,
   class03265 head,
   class03265 gui,
   class03265 ground,
   class03265 fixed,
   class03265 fixedFromBottom
) {
   public static final class03702 N = new class03702(
      class03265.N, class03265.N, class03265.N, class03265.N, class03265.N, class03265.N, class03265.N, class03265.N, class03265.N
   );

   public class03265 L() {
      return this.firstPersonLeftHand;
   }

   public class03265 M() {
      return this.ground;
   }

   public class03702(
      class03265 thirdPersonLeftHand,
      class03265 thirdPersonRightHand,
      class03265 firstPersonLeftHand,
      class03265 firstPersonRightHand,
      class03265 head,
      class03265 gui,
      class03265 ground,
      class03265 fixed,
      class03265 fixedFromBottom
   ) {
      this.thirdPersonLeftHand = thirdPersonLeftHand;
      this.thirdPersonRightHand = thirdPersonRightHand;
      this.firstPersonLeftHand = firstPersonLeftHand;
      this.firstPersonRightHand = firstPersonRightHand;
      this.head = head;
      this.gui = gui;
      this.ground = ground;
      this.fixed = fixed;
      this.fixedFromBottom = fixedFromBottom;
   }

   public class03265 B() {
      return this.fixed;
   }

   public class03265 Z() {
      return this.fixedFromBottom;
   }

   public class03265 i() {
      return this.head;
   }

   public class03265 u() {
      return this.firstPersonRightHand;
   }

   public class03265 y() {
      return this.thirdPersonRightHand;
   }

   public class03265 N() {
      return this.thirdPersonLeftHand;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public class03265 N(class03662 var1) {
      return switch (var1) {
         case field_4323 -> this.thirdPersonLeftHand;
         case field_4320 -> this.thirdPersonRightHand;
         case field_4321 -> this.firstPersonLeftHand;
         case field_4322 -> this.firstPersonRightHand;
         case field_4316 -> this.head;
         case field_4317 -> this.gui;
         case field_4318 -> this.ground;
         case field_4319 -> this.fixed;
         case field_61988 -> this.fixedFromBottom;
         default -> class03265.N;
      };
   }

   public class03265 R() {
      return this.gui;
   }
}
