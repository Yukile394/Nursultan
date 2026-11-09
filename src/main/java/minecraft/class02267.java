package minecraft;

import com.mojang.brigadier.arguments.StringArgumentType;
import java.util.Optional;

public record class02267(String id, class00392 title, class01283 source, Optional<class02298> knownPackInfo) {
   public class01283 L() {
      return this.source;
   }

   public class02267(String id, class00392 title, class01283 source, Optional<class02298> knownPackInfo) {
      super();
      this.id = id;
      this.title = title;
      this.source = source;
      this.knownPackInfo = knownPackInfo;
   }

   public Optional<class02298> u() {
      return this.knownPackInfo;
   }

   public class00392 y() {
      return this.title;
   }

   public String N() {
      return this.id;
   }

   public class00392 N(boolean var1, class00392 var2) {
      return class00390.N(this.source.method_45282(class00392.y(this.id)))
         .N(
            var3 -> var3.N(var1 ? class06541.field_1060 : class06541.field_1061)
               .N(StringArgumentType.escapeIfRequired(this.id))
               .N(new class00401(class00392.i().y(this.title).i("\n").y(var2)))
         );
   }
}
