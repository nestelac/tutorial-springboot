import { Pageable2 } from 'src/app/prestamo/model/page/Pageable2';
import { Prestamo } from './Prestamo';

export class PrestamoPage {
    content: Prestamo[];
    pageable2: Pageable2;
    totalElements: number;
}
