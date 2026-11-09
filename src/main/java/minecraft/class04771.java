package minecraft;

import com.mojang.util.UndashedUuid;
import java.util.Optional;
import java.util.UUID;

public class class04771 {
   private final String N;
   private final UUID y;
   private final String L;
   private final Optional<String> u;
   private final Optional<String> i;

   public String L() {
      return this.N;
   }

   public class04771(String var1, UUID var2, String var3, Optional<String> var4, Optional<String> var5) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
   }

   public Optional<String> i() {
      return this.i;
   }

   public String u() {
      return this.L;
   }

   public UUID y() {
      return this.y;
   }

   public String N() {
      return "token:" + this.L + ":" + UndashedUuid.toString(this.y);
   }

   public Optional<String> R() {
      return this.u;
   }
}
