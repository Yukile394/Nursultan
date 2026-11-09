package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;

public record class00433(Optional<class07209> hivePos, Optional<class07209> flowerPos, int travelTicks, List<class07209> blacklistedHives) {
   public static final class02362<ByteBuf, class00433> N = class02362.N(
      class07209.field_48404.N_33(class02389::N),
      class00433::N,
      class07209.field_48404.N_33(class02389::N),
      class00433::y,
      class02389.B,
      class00433::L,
      class07209.field_48404.N_33(class02389.N()),
      class00433::u,
      class00433::new
   );

   public int L() {
      return this.travelTicks;
   }

   public class00433(Optional<class07209> hivePos, Optional<class07209> flowerPos, int travelTicks, List<class07209> blacklistedHives) {
      super();
      this.hivePos = hivePos;
      this.flowerPos = flowerPos;
      this.travelTicks = travelTicks;
      this.blacklistedHives = blacklistedHives;
   }

   public List<class07209> u() {
      return this.blacklistedHives;
   }

   public Optional<class07209> y() {
      return this.flowerPos;
   }

   public boolean N(class07209 var1) {
      return this.hivePos.isPresent() && var1.equals(this.hivePos.get());
   }

   public Optional<class07209> N() {
      return this.hivePos;
   }
}
