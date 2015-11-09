import Utilities.InvalidValueException;

public class AttributeList {

    enum NodeAttributes{
        COLOR {
            @Override
            public void validate(String value, JSONParser.NodeAttrContext ctx) throws InvalidValueException {
                for(Colors color : Colors.values()){
                    if(color.name().equalsIgnoreCase(value)){
                        return;
                    }
                }
                throw new InvalidValueException("Unknown or invalid color in node COLOR attribute. Line " + ctx.name.getLine() + " Position: " + ctx.name.getCharPositionInLine());
            }
        },
        FONTCOLOR {
            @Override
            public void validate(String value, JSONParser.NodeAttrContext ctx) throws InvalidValueException{
                for(Colors color : Colors.values()){
                    if(color.name().equalsIgnoreCase(value)){
                        return;
                    }
                }
                throw new InvalidValueException("Unknown or invalid fontcolor in node FONTCOLOR attribute. Line " + ctx.name.getLine() + " Position: " + ctx.name.getCharPositionInLine());
            }
        },
        FILLCOLOR {
            @Override
            public void validate(String value, JSONParser.NodeAttrContext ctx) throws InvalidValueException{
                for(Colors color : Colors.values()){
                    if(color.name().equalsIgnoreCase(value)){
                        return;
                    }
                }
                throw new InvalidValueException("Unknown or invalid color in node FILLCOLOR attribute. Line " + ctx.name.getLine() + " Position: " + ctx.name.getCharPositionInLine());
            }
        },
        HEIGHT{
            @Override
            public void validate(String value, JSONParser.NodeAttrContext ctx) throws InvalidValueException{
                if(!isNumeric(value)){
                    throw new InvalidValueException("Non numeric value in node HEIGHT attribute. Line " + ctx.name.getLine() + " Position: " + ctx.name.getCharPositionInLine());
                }
            }
        },
        WIDTH{
            @Override
            public void validate(String value, JSONParser.NodeAttrContext ctx) throws InvalidValueException{
                if(!isNumeric(value)){
                    throw new InvalidValueException("Non numeric value in node WIDTH attribute. Line " + ctx.name.getLine() + " Position: " + ctx.name.getCharPositionInLine());
                }
            }
        },
        MARGIN{
            @Override
            public void validate(String value, JSONParser.NodeAttrContext ctx) throws InvalidValueException{
                if(!isNumeric(value)){
                    throw new InvalidValueException("Non numeric value in node MARGIN attribute. Line " + ctx.name.getLine() + " Position: " + ctx.name.getCharPositionInLine());
                }
            }
        },
        STYLE{
            @Override
            public void validate(String value, JSONParser.NodeAttrContext ctx) throws InvalidValueException{
                for(NodeStyles ns : NodeStyles.values()){
                    if(ns.name().equalsIgnoreCase(value)){
                        return;
                    }
                }
                throw new InvalidValueException("Unknown or invalid node style in STYLE attribute. Line " + ctx.name.getLine() + " Position: " + ctx.name.getCharPositionInLine());
            }
        },
        SHAPE{
            @Override
            public void validate(String value, JSONParser.NodeAttrContext ctx) throws InvalidValueException{
                for(NodeShapes ns : NodeShapes.values()){
                    if(ns.name().equalsIgnoreCase(value)){
                        return;
                    }
                }
                throw new InvalidValueException("Unknown or invalid node shape in SHAPE attribute. Line " + ctx.name.getLine() + " Position: " + ctx.name.getCharPositionInLine());
            }
        },
        FONTSIZE{
            @Override
            public void validate(String value, JSONParser.NodeAttrContext ctx) throws InvalidValueException{
                if(!isNumeric(value)){
                    throw new InvalidValueException("Non numeric value in node ORIENTATION attribute. Line " + ctx.name.getLine() + " Position: " + ctx.name.getCharPositionInLine());
                }
            }
        },
        SIDES{
            @Override
            public void validate(String value, JSONParser.NodeAttrContext ctx) throws InvalidValueException{
                if(!isNumeric(value)){
                    throw new InvalidValueException("Non numeric value in node SIDES attribute. Line " + ctx.name.getLine() + " Position: " + ctx.name.getCharPositionInLine());
                }
            }
        };
        public abstract void validate(String value, JSONParser.NodeAttrContext ctx) throws InvalidValueException;
    }

    enum LinkAttributes{
        COLOR {
            @Override
            public void validate(String value, JSONParser.LinkAttrContext ctx) throws InvalidValueException{
                for(Colors color : Colors.values()){
                    if(color.name().equalsIgnoreCase(value)){
                        return;
                    }
                }
                throw new InvalidValueException("Unknown or invalid color in link COLOR attribute. Line " + ctx.name.getLine() + " Position: " + ctx.name.getCharPositionInLine());
            }
        },
        FONTCOLOR {
            @Override
            public void validate(String value, JSONParser.LinkAttrContext ctx) throws InvalidValueException{
                for(Colors color : Colors.values()){
                    if(color.name().equalsIgnoreCase(value)){
                        return;
                    }
                }
                throw new InvalidValueException("Unknown or invalid fontcolor in link FONTCOLOR attribute. Line " + ctx.name.getLine() + " Position: " + ctx.name.getCharPositionInLine());
            }
        },
        ARROWHEAD{
            @Override
            public void validate(String value, JSONParser.LinkAttrContext ctx) throws InvalidValueException{
                for(Arrowheads arrow : Arrowheads.values()){
                    if(arrow.name().equalsIgnoreCase(value)){
                        return;
                    }
                }
                throw new InvalidValueException("Unknown or invalid arrowhead in link ARROWHEAD attribute. Line " + ctx.name.getLine() + " Position: " + ctx.name.getCharPositionInLine());
            }
        },
        ARROWTAIL{
            @Override
            public void validate(String value, JSONParser.LinkAttrContext ctx) throws InvalidValueException{
                for(Arrowheads arrow : Arrowheads.values()){
                    if(arrow.name().equalsIgnoreCase(value)){
                        return;
                    }
                }
                throw new InvalidValueException("Unknown or invalid arrowhead in link ARROWTAIL attribute. Line " + ctx.name.getLine() + " Position: " + ctx.name.getCharPositionInLine());
            }
        },
        ARROWSIZE{
            @Override
            public void validate(String value, JSONParser.LinkAttrContext ctx) throws InvalidValueException{
                if(!isNumeric(value)){
                    throw new InvalidValueException("Non numeric value in link ARROWSIZE attribute. Line " + ctx.name.getLine() + " Position: " + ctx.name.getCharPositionInLine());
                }
            }
        },
        STYLE{
            @Override
            public void validate(String value, JSONParser.LinkAttrContext ctx) throws InvalidValueException{
                for(LinkStyles ls : LinkStyles.values()){
                    if(ls.name().equalsIgnoreCase(value)){
                        return;
                    }
                }
                throw new InvalidValueException("Unknown or invalid link style in link STYLE attribute. Line " + ctx.name.getLine() + " Position: " + ctx.name.getCharPositionInLine());
            }
        },
        DIR{
            @Override
            public void validate(String value, JSONParser.LinkAttrContext ctx) throws InvalidValueException{
                for(LinkDir ld : LinkDir.values()){
                    if(ld.name().equalsIgnoreCase(value)){
                        return;
                    }
                }
                throw new InvalidValueException("Unknown or invalid link direction in link DIR attribute. Line " + ctx.name.getLine() + " Position: " + ctx.name.getCharPositionInLine());
            }
        };
        public abstract void validate(String value, JSONParser.LinkAttrContext ctx) throws InvalidValueException;
    }

    enum GroupAttributes{
        STYLE{
            @Override
            public void validate(String value, JSONParser.GroupAttrContext ctx) throws InvalidValueException{
                for(GroupStyles gs : GroupStyles.values()){
                    if(gs.name().equalsIgnoreCase(value)){
                        return;
                    }
                }
                throw new InvalidValueException("Unknown or invalid group style in STYLE attribute. Line " + ctx.name.getLine() + " Position: " + ctx.name.getCharPositionInLine());
            }
        },
        COLOR {
            @Override
            public void validate(String value, JSONParser.GroupAttrContext ctx) throws InvalidValueException{
                for(Colors color : Colors.values()){
                    if(color.name().equalsIgnoreCase(value)){
                        return;
                    }
                }
                throw new InvalidValueException("Unknown or invalid color in group COLOR attribute. Line " + ctx.name.getLine() + " Position: " + ctx.name.getCharPositionInLine());
            }
        },
        BGCOLOR {
            @Override
            public void validate(String value, JSONParser.GroupAttrContext ctx) throws InvalidValueException{
                for(Colors color : Colors.values()){
                    if(color.name().equalsIgnoreCase(value)){
                        return;
                    }
                }
                throw new InvalidValueException("Unknown or invalid color in group BGCOLOR attribute. Line " + ctx.name.getLine() + " Position: " + ctx.name.getCharPositionInLine());
            }
        },
        FILLCOLOR {
            @Override
            public void validate(String value, JSONParser.GroupAttrContext ctx) throws InvalidValueException{
                for(Colors color : Colors.values()){
                    if(color.name().equalsIgnoreCase(value)){
                        return;
                    }
                }
                throw new InvalidValueException("Unknown or invalid color in group FILLCOLOR attribute. Line " + ctx.name.getLine() + " Position: " + ctx.name.getCharPositionInLine());
            }
        },
        PENWIDTH {
            @Override
            public void validate(String value, JSONParser.GroupAttrContext ctx) throws InvalidValueException{
                if(!isNumeric(value)){
                    throw new InvalidValueException("Non numeric value in group PENWIDTH attribute. Line " + ctx.name.getLine() + " Position: " + ctx.name.getCharPositionInLine());
                }
            }
        },
        PENCOLOR {
            @Override
            public void validate(String value, JSONParser.GroupAttrContext ctx) throws InvalidValueException{
                for(Colors color : Colors.values()){
                    if(color.name().equalsIgnoreCase(value)){
                        return;
                    }
                }
                throw new InvalidValueException("Unknown or invalid color in group PENCOLOR attribute. Line " + ctx.name.getLine() + " Position: " + ctx.name.getCharPositionInLine());
            }
        };
        public abstract void validate(String value, JSONParser.GroupAttrContext ctx) throws InvalidValueException;
    }

    enum Colors{
        ALICEBLUE,	ANTIQUEWHITE, AQUAMARINE, AZURE, BEIGE, BISQUE, BLACK, BLANCHEDALMOND, BLUE,
        BLUEVIOLET, BROWN, BURLYWOOD, CADETBLUE, CHARTREUSE, CHOCOLATE, CORAL, CORNFLOWERBLUE,	CORNSILK,
        CRIMSON, CYAN, DARKGOLDENROD, DARKGREEN, DARKKHAKI, DARKOLIVEGREEN, DARKORANGE, DARKORCHID,
        DARKSALMON ,DARKSEAGREEN, DARKSLATEBLUE, DARKSLATEGREY, DARKTURQUOISE, DARKVIOLET, DEEPPINK,
        DEEPSKYBLUE, DIMGRAY, DIMGREY, DODGERBLUE, FIREBRICK, FLORALWHITE, FORESTGREEN,	GAINSBORO,	GHOSTWHITE,
        GOLD, GOLDENROD, GRAY, GREEN, GREENYELLOW, GREY, HONEYDEW, HOTPINK, INDIANRED, INDIGO, INVIS, IVORY,
        KHAKI, LAVENDER, LAVENDERBLUSH,	LAWNGREEN, LEMONCHIFFON, LIGHTBLUE, LIGHTCORAL, LIGHTCYAN, LIGHTGOLDENROD,
        LIGHTGOLDENRODYELLOW,	LIGHTGRAY,	LIGHTGREY, LIGHTPINK,	LIGHTSALMON, LIGHTSEAGREEN,	LIGHTSKYBLUE,
        LIGHTSLATEBLUE, LIGHTSLATEGRAY,	LIGHTSLATEGREY,	LIGHTSTEELBLUE,	LIGHTYELLOW, LIMEGREEN,	LINEN,	MAGENTA, MAROON,
        MEDIUMAQUAMARINE, MEDIUMBLUE,	MEDIUMORCHID, MEDIUMPURPLE, MEDIUMSEAGREEN,	MEDIUMSLATEBLUE,
        MEDIUMSPRINGGREEN,	MEDIUMTURQUOISE, MEDIUMVIOLETRED, MIDNIGHTBLUE,	MINTCREAM, MISTYROSE, MOCCASIN,
        NAVAJOWHITE, NAVY, NAVYBLUE, NONE, OLDLACE,	OLIVEDRAB, ORANGE, ORANGERED, ORCHID, PALEGOLDENROD, PALEGREEN,
        PALETURQUOISE, PALEVIOLETRED, PAPAYAWHIP, PEACHPUFF, PERU, PINK, PLUM, POWDERBLUE, PURPLE, RED,	ROSYBROWN,
        ROYALBLUE, SADDLEBROWN, SALMON, SANDYBROWN,	SEAGREEN, SEASHELL, SIENNA, SKYBLUE, SLATEBLUE, SLATEGREY, SNOW,
        SPRINGGREEN, STEELBLUE, TAN, THISTLE, TOMATO, TRANSPARENT,	TURQUOISE,	VIOLET,	VIOLETRED,	WHEAT,	WHITE,
        WHITESMOKE,	YELLOW, YELLOWGREEN
    }

    enum Arrowheads{
        NORMAL, DOT, INV, CROW, TEE, VEE, DIAMOND, NONE, BOX, CURVE, ICURVE
    }

    enum NodeStyles{
        SOLID, DASHED, DOTTED, BOLD, INVIS, FILLED, DIAGONALS, ROUNDED
    }

    enum LinkStyles{
        SOLID, DASHED, DOTTED, BOLD, INVIS
    }

    enum LinkDir{
        FORWARD, BACK, BOTH, NONE
    }

    enum NodeShapes{
        BOX, ELLIPSE, CIRCLE, EGG, TRIANGLE, DIAMOND, TRAPEZIUM, PARALLELOGRAM, HOUSE,
        HEXAGON, OCTAGON, DOUBLECIRCLE, DOUBLEOCTAGON, TRIPLEOCTAGON, INVTRIANGLE, INVTRAPEZIUM,
        INVHOUSE, NONE, POLYGON
    }

    enum GroupStyles{
        SOLID, DASHED, DOTTED, BOLD, INVIS, FILLED, DIAGONALS, ROUNDED
    }

    private static boolean isNumeric(String str){
        try{
            Double num = Double.parseDouble(str);
            if(num > 0.0) {
                return true;
            }
        } catch(NumberFormatException e) {
            return false;
        }
        return false;
    }

}
