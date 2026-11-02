public class keystroke {
    private char identity = '\0';
    private int numKeys = 0;

    public keystroke(char identity) {
        this.identity = identity;
        setnumKeys();
    }

    public void setnumKeys() {
        if (identity >= 'A' && identity <= 'Z') {
            numKeys = 2;
        } else if (identity >= 'a' && identity <= 'z'){
            numKeys = 1;
        } else if (identity >= '0' && identity <= '9'){
            numKeys = 2;
        }
    }

    public int getnumKeys() {
        return numKeys;
    }

    public void format() {
        if (identity >= 'A' && identity <= 'Z') {
            // capital sign
            rightBottom();
            nextKey();
        } else if (identity >= '0' && identity <= '9') {
            // number sign
            leftBottom();
            rightBottom();
            rightMiddle();
            rightTop();
            nextKey();
        } else if (identity == '(' || identity == ')') {
            rightMiddle();
            nextKey();
        } else if (identity == '/') {
            rightTop();
            rightMiddle();
            rightBottom();
            nextKey();
        }
    }

    public void convert() {
            switch (identity) {
                //region lowercase
                case 'a' -> {
                    leftTop();
                    nextKey();
                    break;
                }
                case 'b' -> {
                    leftTop();
                    leftMiddle();
                    nextKey();
                    break;
                }
                case 'c' -> {
                    leftTop();
                    rightTop();
                    nextKey();
                    break;
                }
                case 'd' -> {
                    leftTop();
                    rightTop();
                    rightMiddle();
                    nextKey();
                    break;
                }
                case 'e' -> {
                    leftTop();
                    rightMiddle();
                    nextKey();
                    break;
                }
                case 'f' -> {
                    leftTop();
                    leftMiddle();
                    rightTop();
                    nextKey();
                    break;
                }
                case 'g' -> {
                    leftTop();
                    leftMiddle();
                    rightTop();
                    rightMiddle();
                    nextKey();
                    break;
                }
                case 'h' -> {
                    leftTop();
                    leftMiddle();
                    rightMiddle();
                    nextKey();
                    break;
                }
                case 'i' -> {
                    leftMiddle();
                    rightTop();
                    nextKey();
                    break;
                }
                case 'j' -> {
                    leftMiddle();
                    rightTop();
                    rightMiddle();
                    nextKey();
                    break;
                }
                case 'k' -> {
                    leftTop();
                    leftBottom();
                    nextKey();
                    break;
                }
                case 'l' -> {
                    leftTop();
                    leftMiddle();
                    leftBottom();
                    nextKey();
                    break;
                }
                case 'm' -> {
                    leftTop();
                    leftBottom();
                    rightTop();
                    nextKey();
                    break;
                }
                case 'n' -> {
                    leftTop();
                    leftBottom();
                    rightTop();
                    rightMiddle();
                    nextKey();
                    break;
                }
                case 'o' -> {
                    leftTop();
                    leftBottom();
                    rightMiddle();
                    nextKey();
                    break;
                }
                case 'p' -> {
                    leftTop();
                    leftMiddle();
                    leftBottom();
                    rightTop();
                    nextKey();
                    break;
                }
                case 'q' -> {
                    leftTop();
                    leftMiddle();
                    leftBottom();
                    rightTop();
                    rightMiddle();
                    nextKey();
                    break;
                }
                case 'r' -> {
                    leftTop();
                    leftMiddle();
                    leftBottom();
                    rightMiddle();
                    nextKey();
                    break;
                }
                case 's' -> {
                    leftMiddle();
                    leftBottom();
                    rightTop();
                    nextKey();
                    break;
                }
                case 't' -> {
                    leftMiddle();
                    leftBottom();
                    rightTop();
                    rightMiddle();
                    nextKey();
                    break;
                }
                case 'u' -> {
                    leftTop();
                    leftBottom();
                    rightBottom();
                    nextKey();
                    break;
                }
                case 'v' -> {
                    leftTop();
                    leftMiddle();
                    leftBottom();
                    rightBottom();
                    nextKey();
                    break;
                }
                case 'w' -> {
                    leftMiddle();
                    rightTop();
                    rightMiddle();
                    rightBottom();
                    nextKey();
                    break;
                }
                case 'x' -> {
                    leftTop();
                    leftBottom();
                    rightTop();
                    rightBottom();
                    nextKey();
                    break;
                }
                case 'y' -> {
                    leftTop();
                    leftBottom();
                    rightTop();
                    rightMiddle();
                    rightBottom();
                    nextKey();
                    break;
                }
                case 'z' -> {
                    leftTop();
                    leftBottom();
                    rightMiddle();
                    rightBottom();
                    nextKey();
                    break;
                }
                //endregion

                //region uppercase & numbers
                case 'A', '1' -> {
                    format();
                    leftTop();
                    nextKey();
                    break;
                }
                case 'B', '2' -> {
                    format();
                    leftTop();
                    leftMiddle();
                    nextKey();
                    break;
                }
                case 'C', '3' -> {
                    format();
                    leftTop();
                    rightTop();
                    nextKey();
                    break;
                }
                case 'D', '4' -> {
                    format();
                    leftTop();
                    rightTop();
                    rightMiddle();
                    nextKey();
                    break;
                }
                case 'E', '5' -> {
                    format();
                    leftTop();
                    rightMiddle();
                    nextKey();
                    break;
                }
                case 'F', '6' -> {
                    format();
                    leftTop();
                    leftMiddle();
                    rightTop();
                    nextKey();
                    break;
                }
                case 'G', '7' -> {
                    format();
                    leftTop();
                    leftMiddle();
                    rightTop();
                    rightMiddle();
                    nextKey();
                    break;
                }
                case 'H', '8' -> {
                    format();
                    leftTop();
                    leftMiddle();
                    rightMiddle();
                    nextKey();
                    break;
                }
                case 'I', '9' -> {
                    format();
                    leftMiddle();
                    rightTop();
                    nextKey();
                    break;
                }
                case 'J', '0' -> {
                    format();
                    leftMiddle();
                    rightTop();
                    rightMiddle();
                    nextKey();
                    break;
                }
                case 'K' -> {
                    format();
                    leftTop();
                    leftBottom();
                    nextKey();
                    break;
                }
                case 'L' -> {
                    format();
                    leftTop();
                    leftMiddle();
                    leftBottom();
                    nextKey();
                    break;
                }
                case 'M' -> {
                    format();
                    leftTop();
                    leftBottom();
                    rightTop();
                    nextKey();
                    break;
                }
                case 'N' -> {
                    format();
                    leftTop();
                    leftBottom();
                    rightTop();
                    rightMiddle();
                    nextKey();
                    break;
                }
                case 'O' -> {
                    format();
                    leftTop();
                    leftBottom();
                    rightMiddle();
                    nextKey();
                    break;
                }
                case 'P' -> {
                    format();
                    leftTop();
                    leftMiddle();
                    leftBottom();
                    rightTop();
                    nextKey();
                    break;
                }
                case 'Q' -> {
                    format();
                    leftTop();
                    leftMiddle();
                    leftBottom();
                    rightTop();
                    rightMiddle();
                    nextKey();
                    break;
                }
                case 'R' -> {
                    format();
                    leftTop();
                    leftMiddle();
                    leftBottom();
                    rightMiddle();
                    nextKey();
                    break;
                }
                case 'S' -> {
                    format();
                    leftMiddle();
                    leftBottom();
                    rightTop();
                    nextKey();
                    break;
                }
                case 'T' -> {
                    format();
                    leftMiddle();
                    leftBottom();
                    rightTop();
                    rightMiddle();
                    nextKey();
                    break;
                }
                case 'U' -> {
                    format();
                    leftTop();
                    leftBottom();
                    rightBottom();
                    nextKey();
                    break;
                }
                case 'V' -> {
                    format();
                    leftTop();
                    leftMiddle();
                    leftBottom();
                    rightBottom();
                    nextKey();
                    break;
                }
                case 'W' -> {
                    format();
                    leftMiddle();
                    rightTop();
                    rightMiddle();
                    rightBottom();
                    nextKey();
                    break;
                }
                case 'X' -> {
                    format();
                    leftTop();
                    leftBottom();
                    rightTop();
                    rightBottom();
                    nextKey();
                    break;
                }
                case 'Y' -> {
                    format();
                    leftTop();
                    leftBottom();
                    rightTop();
                    rightMiddle();
                    rightBottom();
                    nextKey();
                    break;
                }
                case 'Z' -> {
                    format();
                    leftTop();
                    leftBottom();
                    rightMiddle();
                    rightBottom();
                    nextKey();
                    break;
                }
                //endregion &

                //region punctuation
                case ',' -> {
                    leftMiddle();
                    break;
                }
                case ';' -> {
                    leftBottom();
                    leftMiddle();
                    break;
                }
                case ':' -> {
                    leftMiddle();
                    rightMiddle();
                    break;
                }
                case '.' -> {
                    leftMiddle();
                    rightMiddle();
                    rightBottom();
                    break;
                }
                case '!' -> {
                    leftMiddle();
                    rightMiddle();
                    leftBottom();
                    break;
                }
                case '(' -> {
                    format();
                    leftTop();
                    leftMiddle();
                    rightBottom();
                    break;
                }
                case ')' -> {
                    format();
                    rightMiddle();
                    rightTop();
                    leftBottom();
                    break;
                }
                case '?' -> {
                    leftMiddle();
                    leftBottom();
                    rightBottom();
                    break;
                }
                case '/' -> {
                    rightTop();
                    leftBottom();
                    break;
                } case '$' -> {
                    format();
                    rightTop();
                    leftMiddle();
                    leftBottom();
                    break;
                } case '\'' -> {
                    leftBottom();
                    break;
                }
                case '-' -> {
                    leftBottom();
                    rightBottom();
                    break;
                }
                //endregion

                case ' ' -> {
                    space();
                    break;
                }

                // if character not found - block
                default -> {
                    rightTop();
                    rightMiddle();
                    rightBottom();
                    leftTop();
                    leftMiddle();
                    leftBottom();
                    nextKey();
                    // Handle spaces, punctuation, or unsupported characters here
                    break;
                }
            }
    }

    //region aspiring motor stuff
    public void leftTop() {
        System.out.print("1");
    }

    public void leftMiddle() {
        System.out.print("2");
    }

    public void leftBottom() {
        System.out.print("3");
    }

    public void space() {
        System.out.print("space");
    }

    public void rightTop() {
        System.out.print("4");
    }

    public void rightMiddle() {
        System.out.print("5");
    }

    public void rightBottom() {
        System.out.print("6");
    }

    public void nextKey() {
        System.out.print("Next key: ");
    }

    public static void lineSpacer() {
        System.out.println();
        System.out.print("New line start: ");
    }
    //endregion

    } //end keystroke class
