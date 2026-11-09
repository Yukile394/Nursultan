package minecraft;

import org.jspecify.annotations.Nullable;

public record class06419(int addedTime, class01028 content, class03054 tag, boolean endOfEntry) {
   @Nullable
   public class03054 L() {
      return this.tag;
   }

   public class06419(int addedTime, class01028 content, @Nullable class03054 tag, boolean endOfEntry) {
      this.addedTime = addedTime;
      this.content = content;
      this.tag = tag;
      this.endOfEntry = endOfEntry;
   }

   public boolean u() {
      return this.endOfEntry;
   }

   public class01028 y() {
      return this.content;
   }

   public int N(class01590 var1) {
      return var1.N(this.content) + 4;
   }

   public int N() {
      return this.addedTime;
   }
}
