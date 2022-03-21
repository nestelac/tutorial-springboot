import { PrestamoPage } from "./PrestamoPage";

export const PRESTAMO_DATA: PrestamoPage = {
    content: [
        { id: 1, nameGam: 'Game5', nameCli: 'Raul', fechaPres: 1/1/1, fechaDev: 2/2/2 },
        { id: 2, nameGam: 'Game2', nameCli: 'Jordi', fechaPres: 1/1/1, fechaDev: 2/2/2 },
        { id: 3, nameGam: 'Game1', nameCli: 'Nerea', fechaPres: 1/1/1, fechaDev: 2/2/2 },
        { id: 4, nameGam: 'Game6', nameCli: 'Noelia', fechaPres: 1/1/1, fechaDev: 2/2/2 },
        { id: 5, nameGam: 'Game4', nameCli: 'Ruben', fechaPres: 1/1/1, fechaDev: 2/2/2 },
        { id: 6, nameGam: 'Game3', nameCli: 'Alba', fechaPres: 1/1/1, fechaDev: 2/2/2 },
    ],  
    pageable2 : {
        pageSize: 5,
        pageNumber: 0,
        sort: [
            {property: "id", direction: "ASC"}
        ]
    },
    totalElements: 6
}
