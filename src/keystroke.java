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
            capitalize();
        } else {
            numKeys = 1;
        }
    }

    public int getnumKeys() {
        return numKeys;
    }

    public void capitalize() {
        if (numKeys == 2) {
            rightBottom();
            nextKey();
        }
    }

    public void convert() {
            switch (identity) {
                //region letters
                case 'a', 'A' -> {
                    leftTop();
                    nextKey();
                    break;
                }
                case 'b', 'B' -> {
                    leftTop();
                    leftMiddle();
                    nextKey();
                    break;
                }
                case 'c', 'C' -> {
                    leftTop();
                    rightTop();
                    nextKey();
                    break;
                }
                case 'd', 'D' -> {
                    leftTop();
                    rightTop();
                    rightMiddle();
                    nextKey();
                    break;
                }
                case 'e', 'E' -> {
                    leftTop();
                    rightMiddle();
                    nextKey();
                    break;
                }
                case 'f', 'F' -> {
                    leftTop();
                    leftMiddle();
                    rightTop();
                    nextKey();
                    break;
                }
                case 'g', 'G' -> {
                    leftTop();
                    leftMiddle();
                    rightTop();
                    rightMiddle();
                    nextKey();
                    break;
                }
                case 'h', 'H' -> {
                    leftTop();
                    leftMiddle();
                    rightMiddle();
                    nextKey();
                    break;
                }
                case 'i', 'I' -> {
                    leftMiddle();
                    rightTop();
                    nextKey();
                    break;
                }
                case 'j', 'J' -> {
                    leftMiddle();
                    rightTop();
                    rightMiddle();
                    nextKey();
                    break;
                }
                case 'k', 'K' -> {
                    leftTop();
                    leftBottom();
                    nextKey();
                    break;
                }
                case 'l', 'L' -> {
                    leftTop();
                    leftMiddle();
                    leftBottom();
                    nextKey();
                    break;
                }
                case 'm', 'M' -> {
                    leftTop();
                    leftBottom();
                    rightTop();
                    nextKey();
                    break;
                }
                case 'n', 'N' -> {
                    leftTop();
                    leftBottom();
                    rightTop();
                    rightMiddle();
                    nextKey();
                    break;
                }
                case 'o', 'O' -> {
                    leftTop();
                    leftBottom();
                    rightMiddle();
                    nextKey();
                    break;
                }
                case 'p', 'P' -> {
                    leftTop();
                    leftMiddle();
                    leftBottom();
                    rightTop();
                    nextKey();
                    break;
                }
                case 'q', 'Q' -> {
                    leftTop();
                    leftMiddle();
                    leftBottom();
                    rightTop();
                    rightMiddle();
                    nextKey();
                    break;
                }
                case 'r', 'R' -> {
                    leftTop();
                    leftMiddle();
                    leftBottom();
                    rightMiddle();
                    nextKey();
                    break;
                }
                case 's', 'S' -> {
                    leftMiddle();
                    leftBottom();
                    rightTop();
                    nextKey();
                    break;
                }
                case 't', 'T' -> {
                    leftMiddle();
                    leftBottom();
                    rightTop();
                    rightMiddle();
                    nextKey();
                    break;
                }
                case 'u', 'U' -> {
                    leftTop();
                    leftBottom();
                    rightBottom();
                    nextKey();
                    break;
                }
                case 'v', 'V' -> {
                    leftTop();
                    leftMiddle();
                    leftBottom();
                    rightBottom();
                    nextKey();
                    break;
                }
                case 'w', 'W' -> {
                    leftMiddle();
                    rightTop();
                    rightMiddle();
                    rightBottom();
                    nextKey();
                    break;
                }
                case 'x', 'X' -> {
                    leftTop();
                    leftBottom();
                    rightTop();
                    rightBottom();
                    nextKey();
                    break;
                }
                case 'y', 'Y' -> {
                    leftTop();
                    leftBottom();
                    rightTop();
                    rightMiddle();
                    rightBottom();
                    nextKey();
                    break;
                }
                case 'z', 'Z' -> {
                    leftTop();
                    leftBottom();
                    rightMiddle();
                    rightBottom();
                    nextKey();
                    break;
                }
                case ' ' -> {
                    space();
                    break;
                }
                //endregion

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
    //endregion

    } //end keystroke class
