package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import java.util.List;
import org.jspecify.annotations.Nullable;

public record class01728<T>(class01894 id, List<class01716<T>> entries) implements class01747<T>, class07684<T> {
   public class01728(class01894 id, List<class01716<T>> entries) {
      super();
      this.id = id;
      this.entries = entries;
   }

   @Override
   public List<class01716<T>> y() {
      return this.entries;
   }

   @Override
   public class01894 N() {
      return this.id;
   }

   @Override
   public class01747<T> N(@Nullable class07001 var1, CommandDispatcher<T> var2) throws class01878 {
      return this;
   }
}
