package minecraft;

import java.util.Locale;
import org.jspecify.annotations.Nullable;

public record class01228(class07209 pos, class00500 state, class07001 nbt) {

   @Nullable
   public class07001 L() {
      return this.nbt;
   }

   public class01228(class07209 pos, class00500 state, @Nullable class07001 nbt) {
      this.pos = pos;
      this.state = state;
      this.nbt = nbt;
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.pos, this.state, this.nbt);
   }

   public class00500 y() {
      return this.state;
   }

   public class07209 N() {
      return this.pos;
   }
}
