package minecraft;

import java.util.Optional;

public record class00768(class03556<class02195> type, byte x, byte y, byte rot, Optional<class00392> name) {
   public static final class02362<class04247, class00768> N = class02362.N(
      class02195.L,
      class00768::L,
      class02389.L,
      class00768::u,
      class02389.L,
      class00768::i,
      class02389.L,
      class00768::R,
      class03748.L,
      class00768::M,
      class00768::new
   );

   public class03556<class02195> L() {
      return this.type;
   }

   public Optional<class00392> M() {
      return this.name;
   }

   public class00768(class03556<class02195> type, byte x, byte y, byte rot, Optional<class00392> name) {
      super();
      rot = (byte)(rot & 15);
      this.type = type;
      this.x = x;
      this.y = y;
      this.rot = rot;
      this.name = name;
   }

   public byte i() {
      return this.y;
   }

   public byte u() {
      return this.x;
   }

   public boolean y() {
      return this.type.N().L();
   }

   public class01894 N() {
      return this.type.N().y();
   }

   public byte R() {
      return this.rot;
   }
}
