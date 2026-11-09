package minecraft;

import java.util.List;
import org.jspecify.annotations.Nullable;

public record class06390(int addedTime, class00392 content, class04469 signature, class03054 tag) {
   private static final int i = 4;

   @Nullable
   public class04469 L() {
      return this.signature;
   }

   public class06390(int addedTime, class00392 content, @Nullable class04469 signature, @Nullable class03054 tag) {
      this.addedTime = addedTime;
      this.content = content;
      this.signature = signature;
      this.tag = tag;
   }

   @Nullable
   public class03054 u() {
      return this.tag;
   }

   public class00392 y() {
      return this.content;
   }

   public List<class01028> N(class01590 var1, int var2) {
      if (this.tag != null && this.tag.R() != null) {
         var2 -= this.tag.R().field_39766 + 4 + 2;
      }

      return class04923.N(this.content, var2, var1);
   }

   public int N() {
      return this.addedTime;
   }
}
