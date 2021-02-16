import React from 'react';
import {CardDeck, Card} from 'react-bootstrap';

const CardBox = () => {
    return (
        <React.Fragment>
            <CardDeck>
                <Card className='text-center'>
                    <Card.Body>
                    <Card.Title>Schema</Card.Title>
                    <Card.Text>
                        John Doe
                    </Card.Text>
                    </Card.Body>
                </Card>
                <Card className='text-center'>
                    <Card.Body>
                    <Card.Title>Statistic</Card.Title>
                    <Card.Subtitle className="mb-2 text-muted">Python</Card.Subtitle>
                    <Card.Text>
                        Some text in here
                    </Card.Text>
                    </Card.Body>
                </Card>
                <Card className='text-center'>
                    <Card.Body>
                    <Card.Title>Line of codes</Card.Title>
                    <Card.Text>
                        Some lines of codes
                    </Card.Text>
                    </Card.Body>
                </Card>
                <Card className='text-center'>
                    <Card.Body>
                    <Card.Title>Something</Card.Title>
                    <Card.Text>
                        John Doe
                    </Card.Text>
                    </Card.Body>
                </Card>
            </CardDeck>
        </React.Fragment>
    )
}

export default CardBox;
