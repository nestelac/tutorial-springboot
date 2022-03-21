import { Pageable } from "src/app/author/model/page/Pageable";
import { Author } from "./Author";

export class AuthorPage{
    content: Author[];
    pageable: Pageable;
    totalElements: number;
}