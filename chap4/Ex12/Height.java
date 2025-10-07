package chap4.Ex12;

public class Height {
  private float val;

  public Height(float _val) {
    val = _val;
  }

  public float recommendedWeight(int age) { // like the formula in the topic
    return (val - 100 + age / 10) * 0.90f;
  }
}