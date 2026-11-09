package minecraft;

import Nursultan.class10228;
import java.util.List;

public record class03663(List<class10228> lines, int width) {
   public class03663(List<class10228> lines, int width) {
      this.lines = lines;
      this.width = width;
   }

   public int y() {
      return this.width;
   }

   public List<class10228> N() {
      return this.lines;
   }
}
