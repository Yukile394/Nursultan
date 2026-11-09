package minecraft;

import com.mojang.authlib.yggdrasil.ProfileResult;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public class class00459 implements class07396 {
   private final class07932 N;
   private final class05623 y;

   @Override
   public Optional<class08774> L(UUID var1) {
      return this.y.Nf().R().N(var1);
   }

   @Nullable
   @Override
   public class04770 L(String var1) {
      return this.y.Nm().N(var1);
   }

   public class00459(class05623 var1, class07932 var2) {
      super();
      this.N = var2;
      this.y = var1;
   }

   @Override
   public Optional<class04770> y(Optional<UUID> var1, Optional<String> var2) {
      if (var1.isPresent()) {
         return Optional.ofNullable(this.y.Nm().y((UUID)var1.get()));
      } else {
         return var2.isPresent() ? Optional.ofNullable(this.y.Nm().N((String)var2.get())) : Optional.empty();
      }
   }

   @Override
   public Optional<class08774> y(UUID var1) {
      return Optional.ofNullable(this.y.Nf().L().fetchProfile(var1, true)).map(var0 -> new class08774(var0.profile()));
   }

   @Override
   public List<class04770> y(String var1) {
      return this.y.Nm().y(var1);
   }

   @Override
   public void N(class04770 var1, class07403 var2) {
      this.y.Nm().y(var1);
      this.N.N(var2, "Remove player '{}'", var1.method_74861());
   }

   @Override
   public List<class04770> N() {
      return this.y.Nm().v();
   }

   @Override
   public Optional<class08774> N(String var1) {
      return this.y.Nf().R().N(var1);
   }

   @Nullable
   @Override
   public class04770 N(UUID var1) {
      return this.y.Nm().y(var1);
   }
}
